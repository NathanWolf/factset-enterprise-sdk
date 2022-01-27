"""
    FactSet Benchmarks API

    FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon.   # noqa: E501

    The version of the OpenAPI document: 1.4.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "fds.sdk.FactSetBenchmarks"
VERSION = "0.9.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
  "fds.sdk.utils == 0.9.0",
]

setup(
    name=NAME,
    version=VERSION,
    description="FactSet SDK - FactSet Benchmarks",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/master/code/python/FactSetBenchmarks",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache-2.0",
    long_description="""\
    FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon.   # noqa: E501
    """
)
